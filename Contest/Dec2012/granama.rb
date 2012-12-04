# http://www.codechef.com/DEC12/problems/GRANAMA

def granama?(recipies)
  recipie1, recipie2 = recipies.split(" ")
  recipie1 = recipie1.chars.sort.join
  recipie2 = recipie2.chars.sort.join
  recipie1 == recipie2
end

def chef_granama?(recipies)
  recipie1, recipie2 = recipies.split(" ")
  recipie1 = recipie1.chars.to_a.uniq.sort.join
  recipie2 = recipie2.chars.to_a.uniq.sort.join
  recipie1 == recipie2
end

num_tests = gets.to_i
num_tests.times do
  line = gets.chomp
  if chef_granama?(line) 
    if granama?(line)
      puts "YES"
    else
      puts "NO"
    end
  else
    puts "YES"
  end
end
