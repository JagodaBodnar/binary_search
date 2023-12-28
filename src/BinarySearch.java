import java.util.List;

class BinarySearch {
    private final List<Integer> list;

    BinarySearch(List<Integer> items) {
        this.list = items;
    }

    int binarySearch(int item) {
        int size = list.size();
        int length = 0;
        while (length <= size) {
            int middleIndex = (length + (size - 1)) / 2;
            if (list.get(middleIndex) == item) {
                return middleIndex;
            }
            if (list.get(middleIndex) < item) {
                length = middleIndex + 1;
            } else {
                size = middleIndex - 1;
            }
        }
        return -1;
    }

    int indexOf(int item) throws ValueNotFoundException {
        int index = binarySearch(item);
        if (index == -1) {
            throw new ValueNotFoundException("Value not in array");
        }
        return index;
    }
}

