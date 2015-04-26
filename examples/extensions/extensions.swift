//run command: xcrun swift extensions.swift

import Foundation

extension Int {
    var milliseconds: NSTimeInterval { return NSTimeInterval(self) * 0.001 }
    var seconds: NSTimeInterval { return NSTimeInterval(self) * 1000.milliseconds }
}

println(4.milliseconds)
println(2.seconds)
