package study.fuel.interfacev3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RentCompanyV3Test {

    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    public void report() throws Exception {
        RentCompanyV3 company = RentCompanyV3.create(); // factory method를 사용해 생성
        company.addCar(new SonataV3(150));
        company.addCar(new K5V3(260));
        company.addCar(new SonataV3(120));
        company.addCar(new AvanteV3(300));
        company.addCar(new K5V3(390));

        String report = company.generateReport();
        assertThat(report).isEqualTo(
                "SonataV3 : 15리터" + NEWLINE +
                        "K5V3 : 20리터" + NEWLINE +
                        "SonataV3 : 12리터" + NEWLINE +
                        "AvanteV3 : 20리터" + NEWLINE +
                        "K5V3 : 30리터"
        );
    }

}