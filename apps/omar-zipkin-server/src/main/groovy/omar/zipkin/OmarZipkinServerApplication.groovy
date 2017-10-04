package omar.zipkin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import zipkin.server.EnableZipkinServer

@SpringBootApplication
@EnableZipkinServer
class OmarZipkinServerApplication
{

    static void main(String[] args)
    {
        SpringApplication.run OmarZipkinServerApplication.class, args
    }

}