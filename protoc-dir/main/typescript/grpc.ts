
export const contentType = {
    'Content-Type': 'application/json'
}

export interface HttpResponse {
    status: number
    headers: any
    body: any
}

export interface HttpRequestDelegate {
    (url: string, headers: any, body: any): Promise<HttpResponse>
}


export class EulerException {
    uuid: string
    code: number
    message: string
    traceUuid: string

    constructor(headers: any) {
        this.uuid = headers['euler-exception-uuid']
        this.code = headers['euler-exception-code']
        this.message = headers['euler-exception-message']
        this.traceUuid = headers['euler-exception-trace-uuid']
    }
}


export class GrpcService {
    private host: string
    private httpRequestDelegate: HttpRequestDelegate

    constructor(host: string, httpRequestDelegate: HttpRequestDelegate) {
        this.host = host
        this.httpRequestDelegate = httpRequestDelegate
    }

    async call(path: string, request: any): Promise<any> {
        const response =  await this.httpRequestDelegate(
            this.host + path,
            contentType,
            request
        )

        if (response.status == 200) {
            return response.body
        } else {
            throw new EulerException(response.headers)
        }
    }

}
