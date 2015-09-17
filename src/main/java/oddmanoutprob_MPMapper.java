/**
 * Created by Bannu on 16-09-2015.
 */
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class oddmanoutprob_MPMapper extends Mapper<Object, Text, Text, IntWritable> {

    private final Text key1 = new Text("Set");
    private final IntWritable value1 = new IntWritable();
    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {
        String[] ss = value.toString().split(" ");
        for (String str : ss)
            value1.set(Integer.parseInt(str));
            context.write(key1,value1);

    }

    }
