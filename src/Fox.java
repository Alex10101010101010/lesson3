public class Fox extends Animal {

    //переопределяем equals
    @Override
    public boolean equals(Object obj) {
        // Явное преобразование
        Fox fox = (Fox) obj;// превудение типов
        return (fox.getSpeed() == this.getSpeed() && fox.size == this.size);// прописываем какие параметры сравниваем
    }
}
