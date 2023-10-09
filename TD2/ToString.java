@FunctionalInterface interface ToString<T>{
    //t->String 
    public String repr(T t);
}