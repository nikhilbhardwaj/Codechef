def factorial(n)
  fact = 1
  (1..n).each do |num|
    fact *= num
  end
  fact
end

inp = gets.to_i
(1..inp).each do
  tmp = gets.to_i
  puts (factorial(tmp))
end

