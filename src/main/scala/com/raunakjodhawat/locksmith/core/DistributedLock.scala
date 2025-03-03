package com.raunakjodhawat.locksmith.core

import scala.concurrent.duration.FiniteDuration

trait DistributedLock {
  def acquireLock(input: InputLockKey, duration: FiniteDuration): Boolean = {
    val key = input.toHash
    true
  }
  def releaseLock: Boolean
}
