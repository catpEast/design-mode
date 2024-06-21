package com.mnd;

public class NameRepository implements Container {
    
    private String[] names = {"张三", "李四", "王五", "赵六"};
    
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    
    private class NameIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
