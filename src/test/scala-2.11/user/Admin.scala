package user

import org.scalatest.FunSuite
/**
  * Created by dsegal on 9/28/16.
  */
class AdminTest extends FunSuite {
  test("getPermission when userId is less than 10 should return 0") {
    val admin = Admin
    assert(admin.getPermission(1) == 0)
  }

  test("getPermission when userId is 10 should return 0") {
    val admin = Admin
    assert(admin.getPermission(10) == 0)
  }

  test("getPermission when userId is greater than 10 should return 1") {
    val admin = Admin
    assert(admin.getPermission(11) == 1)
  }
}
