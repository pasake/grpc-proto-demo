FROM hub.tencentyun.com/tensorchen/envoy-alpine:v1.0.0

COPY envoy.yaml /etc/envoy/envoy.yaml
COPY ./build/generated/source/proto/main/descriptor_set.desc /etc/envoy/descriptor_set.desc

CMD /usr/local/bin/envoy -c /etc/envoy/envoy.yaml -l info

EXPOSE 80 9901
