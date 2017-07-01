import java.net.*;

public class DNSSearch
{
    public static void main(String args[])
    {
        try
        {
            InetAddress address = InetAddress.getByName("www.github.com");
            //InetAddress.getByAddress(192.168.25.6 )
            InetAddress me = InetAddress.getLocalHost();
            System.out.println(address);
            System.out.println(me);
        }
        catch (UnknownHostException ex){
            System.out.println("Could not find www.naver.com");
        }
    }
}
