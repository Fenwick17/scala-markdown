println("How fast is the projectile launched at it in m/s")
val speed = scala.io.StdIn.readDouble()
println("What angle was it launched at")
val angle = scala.io.StdIn.readDouble()
val vx = speed * math.cos(angle)
val vy = speed * math.sin(angle)
val g = 9.8
val maxHeightTime = vy / g
val distance = 2 * maxHeightTime * vx
println("The projectile hits the ground in " + distance + " meters.")
