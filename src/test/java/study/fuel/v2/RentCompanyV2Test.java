package study.fuel.v2;

import org.junit.jupiter.api.Test;
import study.fuel.abstractclazz.K5;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RentCompanyV2Test {

    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    public void report() throws Exception {
        RentCompanyV2 company = RentCompanyV2.create(); // factory method를 사용해 생성
        company.addCar(new SonataV2(150));
        company.addCar(new K5V2(260));
        company.addCar(new SonataV2(120));
        company.addCar(new AvanteV2(300));
        company.addCar(new K5V2(390));

        String report = company.generateReport();
        assertThat(report).isEqualTo(
                "SonataV2 : 15리터" + NEWLINE +
                        "K5V2 : 20리터" + NEWLINE +
                        "SonataV2 : 12리터" + NEWLINE +
                        "AvanteV2 : 20리터" + NEWLINE +
                        "K5V2 : 30리터"
        );
    }
}