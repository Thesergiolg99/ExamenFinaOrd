package ufv.dis.final2021.SLG;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class IP {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String ip_from;
    private String ip_to;
    private String country_code;
    private String country_name;
    private String region_name;
    private String city_name;
    private String latitude;
    private String longitude;
    private String zip_code;
    private String time_zone;
    protected IP() {
    }
    public IP( String ip_from, String ip_to, String country_code, String country_name, String region_name, String city_name, String latitude, String longitude, String zip_code, String time_zone) {
        this.ip_from = ip_from;
        this.ip_to = ip_to;
        this.country_code = country_code;
        this.country_name = country_name;
        this.region_name = region_name;
        this.city_name = city_name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zip_code = zip_code;
        this.time_zone = time_zone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp_from() {
        return ip_from;
    }

    public void setIp_from(String ip_from) {
        this.ip_from = ip_from;
    }

    public String getIp_to() {
        return ip_to;
    }

    public void setIp_to(String ip_to) {
        this.ip_to = ip_to;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    //ip = 3232235778 ➔ 192.168.1.2
    public String longToIp(long ip_from) {
        StringBuilder result = new StringBuilder(15);
        for (int i = 0; i < 4; i++) {
            result.insert(0, Long.toString(ip_from & 0xff));
            if (i < 3) {
                result.insert(0, '.');
            }
            ip_from = ip_from >> 8;
        }
        return result.toString();
    }
    //ip = 3232235778 ➔ 192.168.1.2
    public String longToIp2(long ip_to) {
        StringBuilder result1 = new StringBuilder(15);
        for (int i = 0; i < 4; i++) {
            result1.insert(0, Long.toString(ip_to & 0xff));
            if (i < 3) {
                result1.insert(0, '.');
            }
            ip_to = ip_to >> 8;
        }
        return result1.toString();
    }

    // dottedIP = 192.168.1.2 ➔ 3232235778
    public static Long Dot2LongIP(String dottedIP) {
        String[] addrArray = dottedIP.split("\\.");
        long num = 0;
        for (int i = 0; i < addrArray.length; i++) {
            int power = 3 - i;
            num += ((Integer.parseInt(addrArray[i]) % 256) *
                    Math.pow(256, power));
        }
        return num;


    }
}
