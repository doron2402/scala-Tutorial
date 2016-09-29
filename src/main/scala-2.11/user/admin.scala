package user

/**
  * Created by dsegal on 9/28/16.
  */
object Admin {
  def getPermission(userId: Int) : Int = {
    if (userId <= 10) {
      return 0
    }
    return 1
  }
}
