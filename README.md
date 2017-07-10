# Summoners-War-Rune-Efficiency-Calculator
# The algorithm used in this program is based on Barion's Rune Efficiency Theory
# Why numbers were chosen:
# In a 6* rune,
# 40: HP%, Def%, Acc, Res can start at 8% and roll into itself 4 more times in a Legend rune (8+8*4)
# 30: Spd, Crit Rate can start at 6(%) and roll into itself 4 more times in a Legend rune (6+6*4)
# 35: Critical Damage can start at 7% and roll into itself 4 more times in a Legend rune (7+7*4)

# Barion's Theory takes the current value of the rune divide by the maximum potential of the rune
#   then adds 1 to the value and divide the entire number by 2.8.
# Although there is no confirmation on the accuracy of this theory, many rune optimizers for the game
#   utilizes this formula.