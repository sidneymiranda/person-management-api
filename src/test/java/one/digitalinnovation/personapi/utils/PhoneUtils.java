package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entities.Phone;
import one.digitalinnovation.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final String NUMBER = "(11) 8888-3432";
    private static final PhoneType TYPE = PhoneType.HOME;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO(){
        return PhoneDTO.builder()
                .number(NUMBER)
                .type("HOME")
                .build();
    }

    public static Phone createFakeEntity(){
        return Phone.builder()
                .id(PHONE_ID)
                .number(NUMBER)
                .type(TYPE)
                .build();
    }
}
