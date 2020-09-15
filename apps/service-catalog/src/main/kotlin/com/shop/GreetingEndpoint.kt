package com.shop

import com.shop.proto.GreeterGrpc
import com.shop.proto.HelloReply
import com.shop.proto.HelloRequest
import io.grpc.stub.StreamObserver
import javax.inject.Singleton

@Singleton
@Suppress("unused")
class GreetingEndpoint () : GreeterGrpc.GreeterImplBase() {

    override fun sayHello(request: HelloRequest?, responseObserver: StreamObserver<HelloReply>?) {
        val reply = HelloReply.newBuilder().setMessage("Hello World").build()
        responseObserver?.onNext(reply)
        responseObserver?.onCompleted()
    }
}