/**
 * Created by Bannu on 16-09-2015.
 */
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
public class oddmanoutprob_MPReducer  extends Reducer<Text, IntWritable, Text, IntWritable>{
    public void reduce(Text text, Iterable<IntWritable> values, Context context)
            throws IOException, InterruptedException {
        int odd =0;
        for (IntWritable value : values){
            odd ^=value.get();
        }
        context.write(text,new IntWritable(odd));
    }
}
