package com.raunakjodhawat.locksmith.core

import scala.concurrent.duration.FiniteDuration

trait DistributedLock {
  def lock(input: InputLockKey, duration: FiniteDuration): Boolean
}
