public class Container {

  private int contOfLiquid;
  private int maxNumOfLiquid;

  public Container() {
    this.contOfLiquid = 0;
    this.maxNumOfLiquid = 100;
  }

  public int contains() {
    return this.contOfLiquid;
  }

  public void setContains(int num) {
    this.contOfLiquid = num;
  }


  public void add(int amount) {
    if(amount > 0) {
      for(int i = 1; i <= maxNumOfLiquid; i++) {
        if(this.contOfLiquid < maxNumOfLiquid) {
          this.contOfLiquid++;
        }
        if(i == amount){
          break;
        }
      }
    }
  }

  public void remove(int amount) {
    int auxiliar = this.contOfLiquid;

    if(amount > 0) {
      for(int i = this.contOfLiquid - 1; i >= 0; i--) {
        if(this.contOfLiquid > 0) {
          this.contOfLiquid--;
        }

        if(i == (auxiliar - amount)) {
          break;
        }
      }
    }

  }


  @Override
  public String toString() {
    return this.contOfLiquid + "/" + this.maxNumOfLiquid;
  }

}
