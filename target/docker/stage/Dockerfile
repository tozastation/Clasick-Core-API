FROM openjdk:latest as stage0
WORKDIR /opt/docker
COPY opt /opt
USER root
RUN ["chmod", "-R", "u=rX,g=rX", "/opt/docker"]
RUN ["chmod", "u+x,g+x", "/opt/docker/bin/clasick_core_api"]

FROM openjdk:latest
LABEL MAINTAINER="tozastation <b1016031@fun.ac.jp>"
USER root
RUN id -u demiourgos728 2> /dev/null || useradd --system --create-home --uid 1001 --gid 0 demiourgos728
WORKDIR /opt/docker
COPY --from=stage0 --chown=demiourgos728:root /opt/docker /opt/docker
EXPOSE 8080
USER 1001
ENTRYPOINT ["bin/clasick_core_api"]
CMD []
