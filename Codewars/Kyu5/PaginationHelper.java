import java.util.List;

public class PaginationHelper<I> {
    private int itemsPerPage = 0;
    private int sizeArr = 0;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        this.sizeArr = collection.size();
    }
    public int itemCount() { return sizeArr;
    }
    public int pageCount() {
        if (sizeArr == 0 || itemsPerPage == 0) return 0;
        else return (itemCount()-1)/itemsPerPage+1;
    }
    public int pageItemCount(int pageIndex) {
        if (pageIndex < 0) return -1;
        int d = itemCount();
        if (d-(pageIndex + 1)*itemsPerPage >= 0) return  itemsPerPage;
        if (d-(pageIndex + 1)*itemsPerPage < 0 && d-(pageIndex)*itemsPerPage > 0) return  d-(pageIndex)*itemsPerPage;
        else return  -1;
    }
    public int pageIndex(int itemIndex) {
        if(itemIndex >= itemCount() || itemIndex < 0) return -1;
        else return (itemIndex)/itemsPerPage;
    }
}