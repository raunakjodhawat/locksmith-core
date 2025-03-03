package com.raunakjodhawat.locksmith.core

import java.security.MessageDigest

sealed trait InputLockKey {
  def toString: String
}

extension (input: InputLockKey) {
  def toHash: String = {
    val digest = MessageDigest.getInstance("SHA-256")
    val hashBytes = digest.digest(input.toString.getBytes("UTF-8"))
    hashBytes.map("%02x".format(_)).mkString
  }
}
