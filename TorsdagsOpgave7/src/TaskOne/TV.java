package TaskOne;

/* Skriv en klasse, der simulerer et TV. Der skal være mulighed for at vælge kanel, volumen og tænde
og slukke for TV. Husk at det ikke giver mening at forsøge at ændre lyd/kanal, hvis TV er slukket J
Prøv at unit teste følgende adfærd */

public class TV {
    private boolean tvStatus = false;
    private int channel = 0;
    private int volume = 0;

    public boolean turnOn() {
        if (!tvStatus) {
            return tvStatus = true;
        } else {
            return tvStatus = false;
        }
    }

    public int setChannel(int channelNumber) {
        if (tvStatus) {
            this.channel = channelNumber;
            System.out.println("Følgende er blevet valgt: " + this.channel);
            return this.channel;
        } else {
            System.out.println("Ikke muligt. Tv'et er slukket!");
            return this.channel;
        }
    }

    public int channelUp() {
        if (tvStatus) {
            this.channel++;
            System.out.println("Følgende kanal er valgt: " + this.channel);
            return this.channel;
        } else {
            System.out.println("Tv'et er slukket!");
            return this.channel;
        }
    }

    public int setVolume(int volume) {
        if (tvStatus) {
            this.volume = volume;
            System.out.println("Tv'ets volume er sat til: " + this.volume);
            return this.volume;
        } else {
            System.out.println("Tv'et er slukket!");
            return this.volume;
        }
    }

    public int volumeUp() {
        if (tvStatus) {
            this.volume++;
            System.out.println("Lyden er sat til: " + this.volume);
            return this.volume;
        } else {
            System.out.println("Tv'et er slukket!");
            return this.volume;
        }
    }
}
