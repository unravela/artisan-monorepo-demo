package com.shop

import io.grpc.stub.StreamObserver
import shop.CatalogServiceGrpc
import shop.EmptyOuterClass
import shop.MoneyOuterClass
import shop.ServiceCatalog
import javax.inject.Singleton

/**
 * This ugly implementation holds the hardcoded collection of
 * products.
 */
@Singleton
@Suppress("unused")
class CatalogServiceImpl : CatalogServiceGrpc.CatalogServiceImplBase() {

    var products = listOf(
            product("1", "UNIX: A History and a Memoir", "The fascinating story of how Unix began and how it took over the world. ", money(18,0)),
            product("2", "The Cathedral & the Bazaar", "Musings on Linux and Open Source by an Accidental Revolutionary", money(1,0)),
            product("3", "The Soul of A New Machine", "story of one company's efforts to bring a new microcomputer to market ", money(16,0))
    )

    override fun listProducts(request: EmptyOuterClass.Empty?, responseObserver: StreamObserver<ServiceCatalog.ListProductsResponse>?) {
        var resp = ServiceCatalog.ListProductsResponse.newBuilder().addAllProducts(products).build()
        responseObserver?.onNext(resp)
        responseObserver?.onCompleted()
    }

    override fun getProduct(request: ServiceCatalog.GetProductRequest?, responseObserver: StreamObserver<ServiceCatalog.Product>?) {
        var product = products.first { it.id == request?.id }
        responseObserver?.onNext(product)
        responseObserver?.onCompleted()
    }
}

/**
 * Helps and simplify [shop.ServiceCatalog.Product] creation
 */
fun product(id: String, name: String, description: String, money: MoneyOuterClass.Money): ServiceCatalog.Product {
    return ServiceCatalog.Product.newBuilder()
            .setId(id)
            .setName(name)
            .setDescription(description)
            .setPrice(money)
            .build()
}

/**
 * Helps and simplify [shop.MoneyOuterClass.Money] creation
 */
fun money(nanos: Long, units: Long): MoneyOuterClass.Money {
    return MoneyOuterClass.Money.newBuilder()
            .setNanos(nanos)
            .setUnits(units)
            .build()
}