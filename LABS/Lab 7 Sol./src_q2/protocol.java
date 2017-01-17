
/**
 * Created by ahmetturkmen
 */
public class protocol {

    int src_port;
    int dst_port;
    String name;

    public protocol(int src_port,int dst_port,String name){
       int proLimit=65536;
        if(src_port >proLimit && src_port<0 && dst_port>proLimit && dst_port<0){

            src_port=-1;
            dst_port= -1;
            name="INVALID";
        }
    }
}
