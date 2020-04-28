package com.ram.interceptor;

import org.aopalliance.intercept.MethodInterceptor;

import javax.activation.DataSource;

private static class ProxyDataSourceInterceptor implements MethodInterceptor {
    private final DataSource dataSource;
    public ProxyDataSourceInterceptor(final DataSource dataSource) {
        this.dataSource = ProxyDataSourceBuilder.create(dataSource)
                .name("Batch-Insert-Logger")
                .asJson().countQuery().logQueryToSysOut().build();
    }

    // Other methods...
}
