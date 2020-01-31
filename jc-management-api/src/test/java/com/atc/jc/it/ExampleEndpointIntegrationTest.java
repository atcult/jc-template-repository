package com.atc.jc.it;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Archiving Area Search details endpoints test cases.
 *
 * @author agazzarini
 * @since 1.0
 */
@ActiveProfiles("it")
@ComponentScan("com.atc.jc")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = {IntegrationTestConfiguration.class})
public class ExampleEndpointIntegrationTest extends BaseIntegrationTest {

    @Before
    public void createTestData() throws Exception {
        RestAssured.port = port;

        // REQUEST
//        final Response archivingAreaResponse = given()
//                .when()
//                .post(Application.BASE_URI + "/work/1");


        // ASSERTIONS
//        assertThat(archivingAreaResponse.body().jsonPath().getList("docs").size(), is(totalDocumentsInArchivingArea));
//        assertTrue( > 0);

    }
}
