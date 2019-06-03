
public class AsciiCharSequence implements CharSequence {
    private byte[] array;

    public AsciiCharSequence(byte[] array) {
        this.array = array;
    }

    public static void main(String[] args) {

        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
//проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        return (char) array[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] delta = new byte[end - start];
        for (int i = 0; start < end; i++) {
            delta[i] = array[start++];
        }
        return new AsciiCharSequence(delta);
    }

    @Override
    public String toString() {
        return new String(array);
    }


}

