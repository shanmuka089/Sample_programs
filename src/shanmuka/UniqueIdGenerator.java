package shanmuka;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class UniqueIdGenerator {
	
	public static void main(String[] args) {
		
		double x=1800;
		double roundedNumber = (x + 500.0) / 1000.0 * 1000.0;
		
		System.out.println(roundedNumber);
		
		double y=x%1000;
		double z=x-y;
		System.out.println(z);
		
		System.out.println(Math.round(x));
		
		
//		int i = 1732;
//		MathUtils.round((double) i, -1); // nearest ten, 1730.0
//		MathUtils.round((double) i, -2); // nearest hundred, 1700.0
//		MathUtils.round((double) i, -3); // nearest thousand, 2000.0
		
		
//		final String uuid = UUID.randomUUID().toString().replace("-", "").substring(0,18);
//	    System.out.println("uuid = " + uuid);
//	    
//	    Random random = new Random();
//	    long random63BitLong = random.nextLong() & 0x3FFFFFFFFFFFFFFFL;
//	    long variant3BitFlag = 0x8000000000000000L;
//	    System.out.println(random63BitLong + variant3BitFlag);
//	    
//	    LocalDateTime start = LocalDateTime.of(1582, 10, 15, 0, 0, 0);
//	    Duration duration = Duration.between(start, LocalDateTime.now());
//	    long seconds = duration.getSeconds();
//	    long nanos = duration.getNano();
//	    long timeForUuidIn100Nanos = seconds * 10000000 + nanos * 100;
//	    long least12SignificatBitOfTime = (timeForUuidIn100Nanos & 0x000000000000FFFFL) >> 4;
//	    long version = 1 << 12;
//	    
//	      System.out.println((timeForUuidIn100Nanos & 0xFFFFFFFFFFFF0000L) + version + least12SignificatBitOfTime);
	}

}
