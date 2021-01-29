package ufv.dis.final2021.SLG;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPTest {
    IP ip;
    IP ip2;
    private Object IP;


    @BeforeEach
    void setUp() {
        IP = new IP("Diego", "Abad", "Abad", "Abad", "Abad", "Abad", "Abad", "Abad", "Abad", "Abad");

    }

    @Test
    void getId() {
        assertNull(ip.getId());

    }

    @Test
    void setId() {
        ip.setId((long) 1);
        assertEquals((long) 1, ip.getId());
    }

    @Test
    void getip_from() {
        assertEquals("2532573184", ip.getIp_from());
    }
}
