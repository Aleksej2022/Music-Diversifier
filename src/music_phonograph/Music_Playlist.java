package music_phonograph;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Music_Playlist {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner_new = new Scanner(System.in);
        System.out.println("Welcome to the music diversifier phonograph, what music would you like to listen\nA.English Music\nB.Moroccan Music\nC.Lithuanian Music");
        String user = scanner_new.nextLine();

        if (user.equals("A")){
            File file = new File("read.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            System.out.println("This is an English music by Emelie Sande");
            System.out.println("Enter P to play Audio");
            String response = scanner_new.nextLine();
            response = response.toUpperCase();

            if (response.equals("P")){
                clip.start();

                System.out.println("Enter S = Stop PA = Pause");

                response = scanner_new.nextLine();
                response = response.toUpperCase();

                if (response.equals("S")){
                    clip.stop();
                    System.out.println("Thank You!!!");
                }

                if (response.equals("PA")){
                    long clipTimeposition = clip.getMicrosecondPosition();
                    clip.stop();

                    System.out.println("Enter R = Resume S = Stop");

                    response = scanner_new.nextLine();
                    response = response.toUpperCase();

                    if (response.equals("R")){
                        clip.setMicrosecondPosition(clipTimeposition);
                        clip.start();

                        System.out.println("Enter E to exit");

                        response = scanner_new.nextLine();
                        response = response.toUpperCase();

                        System.out.println("Thank you!");
                    }

                    if (response.equals("S")){
                        clip.setMicrosecondPosition(0);
                        clip.start();

                        System.out.println("Enter E to exit");

                        response = scanner_new.nextLine();
                        response = response.toUpperCase();

                        System.out.println("Thank you!");
                    }
                }
            }
        }

        else if (user.equals("B")){
            File file2 = new File("Manal.wav");
            AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
            Clip clip2 = AudioSystem.getClip();
            clip2.open(audioStream2);

            System.out.println("This is a Moroccan Music by Manal");
            System.out.println("Enter P to play Audio");
            String response = scanner_new.nextLine();
            response = response.toUpperCase();

            if (response.equals("P")){
                clip2.start();

                System.out.println("Enter S = Stop PA = Pause");

                response = scanner_new.nextLine();
                response = response.toUpperCase();

                if (response.equals("S")){
                    clip2.stop();
                    System.out.println("Thank You!!!");
                }

                if (response.equals("PA")){
                    long clipTimeposition = clip2.getMicrosecondPosition();
                    clip2.stop();

                    System.out.println("Enter R = Resume S = Stop");

                    response = scanner_new.nextLine();
                    response = response.toUpperCase();

                    if (response.equals("R")){
                        clip2.setMicrosecondPosition(clipTimeposition);
                        clip2.start();

                        System.out.println("Enter E to exit");

                        response = scanner_new.nextLine();
                        response = response.toUpperCase();

                        System.out.println("Thank you!");
                    }

                    if (response.equals("S")){
                        clip2.setMicrosecondPosition(0);
                        clip2.start();

                        System.out.println("Enter E to exit");

                        response = scanner_new.nextLine();
                        response = response.toUpperCase();

                        System.out.println("Thank you!");
                    }
                }
            }
        }

        else if (user.equals("C")){
            File file3 = new File("Lithuania.wav");
            AudioInputStream audioStream3 = AudioSystem.getAudioInputStream(file3);
            Clip clip3 = AudioSystem.getClip();
            clip3.open(audioStream3);

            System.out.println("This is a Lithuanian music");
            System.out.println("Enter P to play Audio");
            String response = scanner_new.nextLine();
            response = response.toUpperCase();

            if (response.equals("P")){
                clip3.start();

                System.out.println("Enter S = Stop PA = Pause");

                response = scanner_new.nextLine();
                response = response.toUpperCase();

                if (response.equals("S")){
                    clip3.stop();
                    System.out.println("Thank You!!!");
                }

                if (response.equals("PA")){
                    long clipTimeposition = clip3.getMicrosecondPosition();
                    clip3.stop();

                    System.out.println("Enter R = Resume S = Stop");

                    response = scanner_new.nextLine();
                    response = response.toUpperCase();

                    if (response.equals("R")){
                        clip3.setMicrosecondPosition(clipTimeposition);
                        clip3.start();

                        System.out.println("Enter E to exit");

                        response = scanner_new.nextLine();
                        response = response.toUpperCase();

                        System.out.println("Thank you!");
                    }

                    if (response.equals("S")){
                        clip3.setMicrosecondPosition(0);
                        clip3.start();

                        System.out.println("Enter E to exit");

                        response = scanner_new.nextLine();
                        response = response.toUpperCase();

                        System.out.println("Thank you!");
                    }
                }
            }
        }
    }
}
