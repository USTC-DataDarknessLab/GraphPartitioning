package ustc.ddl.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GlobalConfig {

    // Graph Sketch Config
    public static  byte hashNum;
    //public static final short compressionRate;
    public static int k;
   // public static final int l;

    // Graph env config
    public static String inputGraphPath;
    public static String inputGraphPath_B;
    public static String inputGraphPath_S;
    public static String outputGraphPath;
    public static String outputResultPath;
    public static int vCount;
    public static int eCount;

    // Graph partition config
    public static int partitionNum;

    // Graph cluster packing config
//    public static final float alpha;
    public static final float lambda;
    public static final float epsilon;
//    public static final double beta;
    public static int batchSize;
    public static int threads;

    static {
        InputStream inputStream = GlobalConfig.class.getResourceAsStream("project.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        hashNum = Byte.parseByte(properties.getProperty("hashNum", "1"));
       // compressionRate = Short.parseShort(properties.getProperty("compressionRate", "100"));
        inputGraphPath = properties.getProperty("inputGraphPath");
        vCount = Integer.parseInt(properties.getProperty("vCount"));
        eCount = Integer.parseInt(properties.getProperty("eCount"));
        partitionNum = Integer.parseInt(properties.getProperty("partitionNum"));
//        alpha = Float.parseFloat(properties.getProperty("alpha"));
        lambda = Float.parseFloat(properties.getProperty("lambda"));
        epsilon = Float.parseFloat(properties.getProperty("epsilon"));
        //        beta = Double.parseDouble(properties.getProperty("beta", "1.0"));
//        k = Integer.parseInt(properties.getProperty("k"));
      //  l = Integer.parseInt(properties.getProperty("l"));
//        batchSize = Integer.parseInt(properties.getProperty("batchSize"));
//        threads = Integer.parseInt(properties.getProperty("threads"));
//        outputGraphPath = properties.getProperty("outputGraphPath");
        outputResultPath = properties.getProperty("outputResultPath", "newpartition/src/ouput/output.txt");
//
//
//        inputGraphPath_S = properties.getProperty("inputGraphPath_S");
//        inputGraphPath_B = properties.getProperty("inputGraphPath_B");

    }

    public static byte getHashNum() {
        return hashNum;
    }

//    public static int getCompressionRate() {
//        return compressionRate;
//    }
public static float getLambda() {
    return lambda;
}

    public static float getEpsilon() {
        return epsilon;
    }
    public static String getInputGraphPath() {
        return inputGraphPath;
    }

    public static int getVCount() {
        return vCount;
    }

    public static int getECount() {
        return eCount;
    }

    public static int getPartitionNum() {
        return partitionNum;
    }

    public static int getMaxClusterVolume() {
        return  eCount / partitionNum;
    }

//    public static float getAlpha() {
//        return alpha;
//    }

    public static double getAverageDegree() {
        return 2.0 * eCount / vCount;
    }
    public static int getK() {
        return k;
    }

//    public static int getL() {
//        return l;
//    }

    public static int getBatchSize() {
        return batchSize;
    }

    public static int getThreads() {
        return threads;
    }

    public static String getOutputGraphPath() {
        return outputGraphPath;
    }
}
