// See http://logback.qos.ch/manual/groovy.html for details on configuration
appender('STDOUT', ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        //pattern = "%level %logger - %msg%n"
        pattern = "%5p [%logger,%X{X-B3-TraceId:-},%X{X-B3-SpanId:-},%X{X-Span-Export:-}] %msg%n"
    }
}

root(ERROR, ['STDOUT'])
logger("omar.zipkin",INFO, ['STDOUT'],false)