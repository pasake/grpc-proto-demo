FROM hub.tencentyun.com/tensorchen/envoy-alpine:v1.0.0

COPY envoy.yaml /etc/envoy/envoy.yaml

#VOLUME /etc/envoy/envoy.yaml
EXPOSE 80 9901

CMD /usr/local/bin/envoy -c /etc/envoy/envoy.yaml -l info
