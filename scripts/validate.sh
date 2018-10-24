#!/bin/sh

export Message='hello world'
java -cp /tmp/helloworld.jar hello.HelloWorld > /tmp/running.log
