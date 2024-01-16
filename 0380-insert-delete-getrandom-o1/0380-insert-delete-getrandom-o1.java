class RandomizedSet {
    HashMap<Integer,Integer> map;
    ArrayList<Integer> list;
    public RandomizedSet() {
        this.map  = new HashMap<>();
        this.list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val,1);
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random rd = new Random();
        int random = rd.nextInt(list.size());
        while(!map.containsKey(list.get(random))){
            random = rd.nextInt(list.size());
        }

        return list.get(random);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */