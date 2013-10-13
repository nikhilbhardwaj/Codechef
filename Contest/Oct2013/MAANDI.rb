def divisors_of(num)
  divisors = [1]
  divisors << (2..Math.sqrt(num).to_i + 1).collect { |n| [n, num/n] if ((num/n) * n) == num }.compact
  divisors << num
  divisors.flatten!
end

def overlucky?(num)
  char_digits = num.to_s.split(//)
  true if char_digits.include?('4') or char_digits.include?('7')
end

def countoverlucky(array)
  total_overlucky_nos = 0
  array.each do |elem|
    total_overlucky_nos += 1 if overlucky?(elem)
  end
  total_overlucky_nos
end

num_tests = gets.to_i
num_tests.times do 
 puts countoverlucky(divisors_of(gets.to_i))
end