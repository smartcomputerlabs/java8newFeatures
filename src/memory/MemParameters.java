package memory;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

public class MemParameters {
    public static void main(String[] args) {
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        System.out.println("--Heap Size---"+(memoryBean.getHeapMemoryUsage().getMax()/(1024*1024*1024))+"--- GB");
        System.out.println("--Non Heap Size---"+(memoryBean.getNonHeapMemoryUsage().getMax()/(1024*1024*1024))+"--- GB");
        System.out.println("--Min Heap Size---"+(memoryBean.getHeapMemoryUsage().getMax()/(1024*1024*1024))+"--- GB");
    }
}
