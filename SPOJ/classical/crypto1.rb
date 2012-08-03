def power(num,exponent)
  return num if exponent == 1
  return (num * num) % 4000000007 if exponent == 2

  if exponent % 2 == 0
    return (power(num,exponent/2) ** 2)% 4000000007
  end

  return (((power(num,exponent/2) ** 2)% 4000000007) * num) % 4000000007
end

target = gets.to_i
mid_epoch = power(target,1000000002)

x1 = Time.at(mid_epoch).utc
x2 = Time.at(4000000007 - mid_epoch).utc

if x1.year >= 1970 && x1.year <= 2030
  puts x1.to_s.gsub(' UTC','')
else
  puts x2.to_s.gsub(' UTC','')
end
