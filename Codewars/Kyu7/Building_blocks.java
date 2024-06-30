class Building_blocks {
private int width;
private int length;
private int height;


public Building_blocks(int[] dig){
    width = dig[0];
    length = dig[1];
    height = dig[2];
}

public int getWidth() {
    return width;
}

public int getLength() {
    return length;
}

public int getHeight() {
    return height;
}
public int getVolume(){
    return getLength()*getHeight()*getWidth();
}
public int getSurfaceArea(){
    return 2*(getLength()*getHeight() + getLength()*getWidth() + getHeight()*getWidth());
}
    }