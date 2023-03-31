
    public class VideoPhone extends Model implements Callable {

        
        public VideoPhone(String namePhone, int number) {
            super(namePhone, number);
        }
        @Override
        public void call(int outputNumber) {
            System.out.println("Подключаю видеоканал для абонента " + outputNumber );
        }
        @Override
        public void ring(int inputNumber) {
            System.out.println("У вас входящий видеовызов..." + inputNumber);
        }
        
      }

