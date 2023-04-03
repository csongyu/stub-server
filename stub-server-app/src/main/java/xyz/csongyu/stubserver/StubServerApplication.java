package xyz.csongyu.stubserver;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.tomakehurst.wiremock.WireMockServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class StubServerApplication implements ApplicationRunner {
    public static void main(final String[] args) {
        SpringApplication.run(StubServerApplication.class, args);
    }

    @Override
    public void run(final ApplicationArguments args) {
        // see https://wiremock.org/docs/configuration/
        final WireMockServer wireMockServer = new WireMockServer(options().usingFilesUnderClasspath("wiremock"));
        wireMockServer.start();
    }
}
