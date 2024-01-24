circleArea :: Double -> Double
circleArea radius = pi * radius * radius
main = do
    let radius = 3.5
    let area = circleArea radius
    putStrLn $ "The area of the circle with radius " ++ show radius ++ " is: " ++ show area