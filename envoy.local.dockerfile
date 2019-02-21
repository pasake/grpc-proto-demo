#FROM envoyproxy/envoy-alpine:3b75abab717f2c824d3b32b1afcf3383a8cb65ff
FROM envoyproxy/envoy-alpine:latest

#COPY envoy.local.yaml /etc/envoy/envoy.yaml

#VOLUME /etc/envoy/envoy.yaml
EXPOSE 80 9901

CMD /usr/local/bin/envoy -c /etc/envoy/envoy.yaml -l info
