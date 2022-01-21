IMAGE=cs4273_p1

.PHONY: docker docker-build docker-run

all: docker-build

docker: docker-build docker-run

docker-build:
	docker build . -t $(IMAGE)

docker-run:
	docker run -it -p 8080:8080 $(IMAGE)
