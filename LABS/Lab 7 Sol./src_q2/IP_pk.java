

/**
 * Created by ahmetturkmen 
 */
public class IP_pk {
    IP_addr src_addr;
    IP_addr dst_addr;
    protocol type;
    int size;


    public IP_pk(IP_addr src_addr, IP_addr dst_addr, protocol type, int size) {


    }


    public boolean checkValidity(boolean result) {
        if (src_addr.equals(0) || dst_addr.equals(0)) {
            return false;

        } else if (type.equals("INVALID")) {
            return false;
        } else if (size == 0) {
            return false;
        } else

            return true;
    }
}
