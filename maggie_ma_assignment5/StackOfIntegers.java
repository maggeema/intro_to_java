class StackOfIntegers {
    //array, size default capacity
    private int[] elements;
    private int size;

    public static final int DEFAULT_CAPACITY =16;

    StackOfIntegers(){
        this.elements = new int[DEFAULT_CAPACITY];
        this.size =0;
    }

    StackOfIntegers(int newCapacity){
        this.elements = new int[newCapacity];
        this.size =0;
    }

    // FOR ASSIGNMENT 5:
    // copy
    public void toCopy(StackOfIntegers stack){
        this.elements = stack.getElements();
        this.size = stack.getSize();
    }

    // clear
    public void toClear(){
        this.size = 0;
        this.elements = new int[0];
//        while (!this.empty()) {
//            this.pop();
//        }
    }

    // max
    public int getMax(){
        if (this.size == 0){
            System.out.println("There are no values in the stack");
        } else {
            int maxnum = Integer.MIN_VALUE;

            for (int i = 0; i < this.size; i++) {
                if (this.elements[i] > maxnum) {
                    maxnum = this.elements[i];
                }
            }

            return maxnum;
        }
    }

    // min
    public int getMin(){
        if (this.size == 0){
            System.out.println("There are no values in the stack");
        } else {
            int minnum = Integer.MAX_VALUE;

            for (int i = 0; i < this.size; i++) {
                if (this.elements[i] < minnum) {
                    minnum = this.elements[i];
                }
            }

            return minnum;
        }
    }

    public ArrayList<Integer> getDuplicate() {
        ArrayList<Integer> duplicated = new ArrayList<Integer>();

        for (int i = 0; i < this.size - 1; i++) {
            for (int j = i + 1; j < this.size; j++) {
                if (this.elements[i] == this.elements[j]) {
                    if (!duplicated.contains(elements[i])) {
                        duplicated.add(elements[i]);
                    } else {
                        continue;
                    }
                }
            }
        }

        if (duplicated.isEmpty()) {
            System.out.println("There are no duplicates!");
            return duplicated;
        } else {
            return duplicated;
        }
    }

    // FROM CLASS:
    // pop
    public int pop(){
        return elements[--size];
    }

    // peek
    public int peek(){
        int t =size;
        return elements[--t];
    }

    // push
    public void push(int value){
        if(this.size == elements.length){
            int []arr = new int[size*2];

            for(int i=0; i<size; i++) {
                arr[i] = elements[i];
            }
            arr[size++] = value;
            elements = arr;
        } else{
            elements[size++] = value;
        }
    }
    // empty
    public boolean empty(){
        return this.size == 0;
    }

    // getSize()
    public int getSize(){
        return this.size;
    }

    // getElement()
    public int[] getElements(){
        return this.elements;
    }

}