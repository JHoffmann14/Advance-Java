package independentcopy;

import java.util.ArrayList;

public class listReader implements Reader {

    private ArrayList<String> arrayList;
    int i = 0;
    public listReader(ArrayList<String> arrayList)
    {
        this.arrayList = arrayList;
    }

    @Override
    public String readln() {
        String tempString;
        try {
            tempString = arrayList.get(i);
            i++;
        } catch (IndexOutOfBoundsException e){
            i = 0;
            return null;
        }

        return  tempString;

    }
}
