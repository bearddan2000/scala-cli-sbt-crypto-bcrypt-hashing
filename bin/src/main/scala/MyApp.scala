import org.mindrot.jbcrypt.BCrypt;

object MyApp {

  def main(args: Array[String]): Unit = {
    val plainText = "Hello World!";
    val stored = BCrypt.hashpw(plainText, BCrypt.gensalt());
    println("Original: " + plainText);
    println("Hash: " + stored);
    println("Verified: " + BCrypt.checkpw(plainText, stored));
  }
}
