package independentcopy;

import java.util.ArrayList;

public class listWriter implements Writer {

    private ArrayList<String> arrayList;

    public listWriter(ArrayList<String> arrayList)
    {
        this.arrayList = arrayList;
    }

    @Override
    public void writeln(String line) {
        arrayList.add(line);
    }
}
